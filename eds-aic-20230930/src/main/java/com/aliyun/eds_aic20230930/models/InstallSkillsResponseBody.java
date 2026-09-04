// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstallSkillsResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The installation results.</p>
     */
    @NameInMap("InstallResults")
    public java.util.List<InstallSkillsResponseBodyInstallResults> installResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InstallSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallSkillsResponseBody self = new InstallSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallSkillsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InstallSkillsResponseBody setInstallResults(java.util.List<InstallSkillsResponseBodyInstallResults> installResults) {
        this.installResults = installResults;
        return this;
    }
    public java.util.List<InstallSkillsResponseBodyInstallResults> getInstallResults() {
        return this.installResults;
    }

    public InstallSkillsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InstallSkillsResponseBodyInstallResults extends TeaModel {
        /**
         * <p>The cloud phone instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-6rnonvrkf59ac****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The installation status.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTALLING</p>
         */
        @NameInMap("Status")
        public String status;

        public static InstallSkillsResponseBodyInstallResults build(java.util.Map<String, ?> map) throws Exception {
            InstallSkillsResponseBodyInstallResults self = new InstallSkillsResponseBodyInstallResults();
            return TeaModel.build(map, self);
        }

        public InstallSkillsResponseBodyInstallResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InstallSkillsResponseBodyInstallResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
