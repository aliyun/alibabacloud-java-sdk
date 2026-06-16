// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeConfiguration extends TeaModel {
    /**
     * <p>The CRC-64 checksum of the code package. If you provide <code>checksum</code>, Function Compute verifies that the code package\&quot;s computed checksum matches this value.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456789</p>
     */
    @NameInMap("checksum")
    public String checksum;

    /**
     * <p>The command and arguments to run in the runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>python,main.py</p>
     */
    @NameInMap("command")
    public java.util.List<String> command;

    /**
     * <p>The programming language for the function\&quot;s runtime, such as python3 or nodejs.</p>
     * 
     * <strong>example:</strong>
     * <p>python3.12</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The name of the OSS bucket that contains the function\&quot;s code package.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-code-bucket</p>
     */
    @NameInMap("ossBucketName")
    public String ossBucketName;

    /**
     * <p>The name of the OSS object for the function\&quot;s code package.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-code-v1.0.zip</p>
     */
    @NameInMap("ossObjectName")
    public String ossObjectName;

    /**
     * <p>The base64-encoded content of the agent\&quot;s code package.</p>
     * 
     * <strong>example:</strong>
     * <p>UEsDBAoAAAAAANF</p>
     */
    @NameInMap("zipFile")
    public String zipFile;

    public static CodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        CodeConfiguration self = new CodeConfiguration();
        return TeaModel.build(map, self);
    }

    public CodeConfiguration setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public CodeConfiguration setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public CodeConfiguration setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CodeConfiguration setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CodeConfiguration setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public CodeConfiguration setZipFile(String zipFile) {
        this.zipFile = zipFile;
        return this;
    }
    public String getZipFile() {
        return this.zipFile;
    }

}
