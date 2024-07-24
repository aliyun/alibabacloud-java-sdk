// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvCustomJobResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public DescribeEnvCustomJobResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A9AEA84-7186-4D8D-B498-4585C6A2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnvCustomJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvCustomJobResponseBody self = new DescribeEnvCustomJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnvCustomJobResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnvCustomJobResponseBody setData(DescribeEnvCustomJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEnvCustomJobResponseBodyData getData() {
        return this.data;
    }

    public DescribeEnvCustomJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEnvCustomJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnvCustomJobResponseBodyData extends TeaModel {
        /**
         * <p>If the <strong>encryptYaml</strong> parameter is set to <code>true</code>, a Base64-encoded YAML string is returned. Otherwise, a plaintext YAML string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Refer to supplementary instructions.</p>
         */
        @NameInMap("ConfigYaml")
        public String configYaml;

        /**
         * <p>The name of the custom job.</p>
         * 
         * <strong>example:</strong>
         * <p>customJob1</p>
         */
        @NameInMap("CustomJobName")
        public String customJobName;

        /**
         * <p>The ID of the environment instance.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxxx</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>run</li>
         * <li>stop</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>run</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEnvCustomJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnvCustomJobResponseBodyData self = new DescribeEnvCustomJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEnvCustomJobResponseBodyData setConfigYaml(String configYaml) {
            this.configYaml = configYaml;
            return this;
        }
        public String getConfigYaml() {
            return this.configYaml;
        }

        public DescribeEnvCustomJobResponseBodyData setCustomJobName(String customJobName) {
            this.customJobName = customJobName;
            return this;
        }
        public String getCustomJobName() {
            return this.customJobName;
        }

        public DescribeEnvCustomJobResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public DescribeEnvCustomJobResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEnvCustomJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
