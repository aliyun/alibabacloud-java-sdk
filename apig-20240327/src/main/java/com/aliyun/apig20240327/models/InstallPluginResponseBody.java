// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class InstallPluginResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public InstallPluginResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>201CFCA0-3AF5-52D0-A0F3-FBA697AF55CB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static InstallPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallPluginResponseBody self = new InstallPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallPluginResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstallPluginResponseBody setData(InstallPluginResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InstallPluginResponseBodyData getData() {
        return this.data;
    }

    public InstallPluginResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InstallPluginResponseBodyDataInstallPluginResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gw-d28mjcmm1hkub84mdbi0</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>pl-cvs7gbum1hkhs6us6vbg</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        public static InstallPluginResponseBodyDataInstallPluginResults build(java.util.Map<String, ?> map) throws Exception {
            InstallPluginResponseBodyDataInstallPluginResults self = new InstallPluginResponseBodyDataInstallPluginResults();
            return TeaModel.build(map, self);
        }

        public InstallPluginResponseBodyDataInstallPluginResults setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public InstallPluginResponseBodyDataInstallPluginResults setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

    }

    public static class InstallPluginResponseBodyData extends TeaModel {
        @NameInMap("installPluginResults")
        public java.util.List<InstallPluginResponseBodyDataInstallPluginResults> installPluginResults;

        public static InstallPluginResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InstallPluginResponseBodyData self = new InstallPluginResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InstallPluginResponseBodyData setInstallPluginResults(java.util.List<InstallPluginResponseBodyDataInstallPluginResults> installPluginResults) {
            this.installPluginResults = installPluginResults;
            return this;
        }
        public java.util.List<InstallPluginResponseBodyDataInstallPluginResults> getInstallPluginResults() {
            return this.installPluginResults;
        }

    }

}
