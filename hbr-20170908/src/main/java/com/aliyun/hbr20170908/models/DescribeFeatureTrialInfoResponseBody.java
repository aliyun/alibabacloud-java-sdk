// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeFeatureTrialInfoResponseBody extends TeaModel {
    /**
     * <p>The return code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the feature is activated. The value false is returned if the feature is not activated. In this case, InTrialPeriod is false and TrialExpireTime is 0.</p>
     */
    @NameInMap("FeatureEnabled")
    public Boolean featureEnabled;

    /**
     * <p>Indicates whether the feature is within the free trial period. The value false is returned if the feature is not activated or the free trial has expired.</p>
     */
    @NameInMap("InTrialPeriod")
    public Boolean inTrialPeriod;

    /**
     * <p>The returned message. The value &quot;successful&quot; is returned upon success. An error message is returned upon failure.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The expiration time of the free trial. The value is a UNIX timestamp, in seconds. The value 0 is returned if the feature is not activated.</p>
     * 
     * <strong>example:</strong>
     * <p>1584597600</p>
     */
    @NameInMap("TrialExpireTime")
    public Long trialExpireTime;

    public static DescribeFeatureTrialInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFeatureTrialInfoResponseBody self = new DescribeFeatureTrialInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFeatureTrialInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFeatureTrialInfoResponseBody setFeatureEnabled(Boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
        return this;
    }
    public Boolean getFeatureEnabled() {
        return this.featureEnabled;
    }

    public DescribeFeatureTrialInfoResponseBody setInTrialPeriod(Boolean inTrialPeriod) {
        this.inTrialPeriod = inTrialPeriod;
        return this;
    }
    public Boolean getInTrialPeriod() {
        return this.inTrialPeriod;
    }

    public DescribeFeatureTrialInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFeatureTrialInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFeatureTrialInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFeatureTrialInfoResponseBody setTrialExpireTime(Long trialExpireTime) {
        this.trialExpireTime = trialExpireTime;
        return this;
    }
    public Long getTrialExpireTime() {
        return this.trialExpireTime;
    }

}
