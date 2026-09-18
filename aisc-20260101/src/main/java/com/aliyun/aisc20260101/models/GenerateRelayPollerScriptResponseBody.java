// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GenerateRelayPollerScriptResponseBody extends TeaModel {
    /**
     * <p>The generation result, which contains the target identifier, the normalized platform, and the installation script.</p>
     */
    @NameInMap("Data")
    public GenerateRelayPollerScriptResponseBodyData data;

    /**
     * <p>The request ID. You can use this ID for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateRelayPollerScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateRelayPollerScriptResponseBody self = new GenerateRelayPollerScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateRelayPollerScriptResponseBody setData(GenerateRelayPollerScriptResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateRelayPollerScriptResponseBodyData getData() {
        return this.data;
    }

    public GenerateRelayPollerScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateRelayPollerScriptResponseBodyData extends TeaModel {
        /**
         * <p>The normalized target platform in the operating system-architecture format.</p>
         * 
         * <strong>example:</strong>
         * <p>linux-amd64</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The installation script content (bash). The script contains a one-time access code, a temporary download link for the poller binary (signed and valid for 1 hour), and a checksum. The script does not contain the actual endpoint or credentials of the target, which are interactively entered during installation. The script carries access credential semantics. Transmit it through a trusted channel and re-download the script to obtain a new one after use.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>The scan target identifier echoed from the request.</p>
         * 
         * <strong>example:</strong>
         * <p>target-abc123def4567</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        public static GenerateRelayPollerScriptResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateRelayPollerScriptResponseBodyData self = new GenerateRelayPollerScriptResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateRelayPollerScriptResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GenerateRelayPollerScriptResponseBodyData setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GenerateRelayPollerScriptResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

    }

}
