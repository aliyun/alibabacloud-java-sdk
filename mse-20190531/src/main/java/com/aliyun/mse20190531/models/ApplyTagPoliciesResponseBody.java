// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyTagPoliciesResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ApplyTagPoliciesResponseBodyData> data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ApplyTagPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyTagPoliciesResponseBody self = new ApplyTagPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyTagPoliciesResponseBody setData(java.util.List<ApplyTagPoliciesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ApplyTagPoliciesResponseBodyData> getData() {
        return this.data;
    }

    public ApplyTagPoliciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyTagPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyTagPoliciesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplyTagPoliciesResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the field is the primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CarryData")
        public Boolean carryData;

        /**
         * <p>Indicates whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The rule is enabled.</li>
         * <li><code>false</code>: The rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The ID of the primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceNum")
        public Integer instanceNum;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rate.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>Indicates whether the routing rule was deleted.</p>
         */
        @NameInMap("Remove")
        public Boolean remove;

        /**
         * <p>The details of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;_base\&quot;: {\&quot;rate\&quot;: 100, \&quot;remove\&quot;: true}, \&quot;blue\&quot;: {\&quot;rate\&quot;: 0}}</p>
         */
        @NameInMap("Rules")
        public String rules;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ApplyTagPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyTagPoliciesResponseBodyData self = new ApplyTagPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyTagPoliciesResponseBodyData setCarryData(Boolean carryData) {
            this.carryData = carryData;
            return this;
        }
        public Boolean getCarryData() {
            return this.carryData;
        }

        public ApplyTagPoliciesResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ApplyTagPoliciesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ApplyTagPoliciesResponseBodyData setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public ApplyTagPoliciesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ApplyTagPoliciesResponseBodyData setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public ApplyTagPoliciesResponseBodyData setRemove(Boolean remove) {
            this.remove = remove;
            return this;
        }
        public Boolean getRemove() {
            return this.remove;
        }

        public ApplyTagPoliciesResponseBodyData setRules(String rules) {
            this.rules = rules;
            return this;
        }
        public String getRules() {
            return this.rules;
        }

        public ApplyTagPoliciesResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ApplyTagPoliciesResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
