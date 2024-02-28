// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeSolutionInstanceConfigurationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<DescribeSolutionInstanceConfigurationRequestParameters> parameters;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the solution.</p>
     */
    @NameInMap("SolutionId")
    public String solutionId;

    public static DescribeSolutionInstanceConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSolutionInstanceConfigurationRequest self = new DescribeSolutionInstanceConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSolutionInstanceConfigurationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSolutionInstanceConfigurationRequest setParameters(java.util.List<DescribeSolutionInstanceConfigurationRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<DescribeSolutionInstanceConfigurationRequestParameters> getParameters() {
        return this.parameters;
    }

    public DescribeSolutionInstanceConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSolutionInstanceConfigurationRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public static class DescribeSolutionInstanceConfigurationRequestParameters extends TeaModel {
        /**
         * <p>The key of the parameter.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter.</p>
         * <br>
         * <p>> The Parameters parameter is optional. If you specify Parameters, you must specify ParameterValue.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeSolutionInstanceConfigurationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSolutionInstanceConfigurationRequestParameters self = new DescribeSolutionInstanceConfigurationRequestParameters();
            return TeaModel.build(map, self);
        }

        public DescribeSolutionInstanceConfigurationRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public DescribeSolutionInstanceConfigurationRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
