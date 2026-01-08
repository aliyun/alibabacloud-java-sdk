// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryInstanceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>29kskkd******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceResponseBody self = new QueryInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInstanceResponseBody setData(QueryInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInstanceResponseBodyData getData() {
        return this.data;
    }

    public QueryInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>VIBER</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:1@alibaba.com">1@alibaba.com</a></p>
         */
        @NameInMap("ContactMail")
        public String contactMail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        /**
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("CustType")
        public String custType;

        /**
         * <p>FacebookBmId</p>
         * 
         * <strong>example:</strong>
         * <p>399298882</p>
         */
        @NameInMap("FacebookBmId")
        public String facebookBmId;

        /**
         * <strong>example:</strong>
         * <p>ins</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <strong>example:</strong>
         * <p>293939*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>viber_ins</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alibaba.com/1.pdf">https://alibaba.com/1.pdf</a></p>
         */
        @NameInMap("IsvTerms")
        public String isvTerms;

        /**
         * <strong>example:</strong>
         * <p>长沙麓谷</p>
         */
        @NameInMap("OfficeAddress")
        public String officeAddress;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>140092992</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        public static QueryInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceResponseBodyData self = new QueryInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInstanceResponseBodyData setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public QueryInstanceResponseBodyData setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public QueryInstanceResponseBodyData setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public QueryInstanceResponseBodyData setCustType(String custType) {
            this.custType = custType;
            return this;
        }
        public String getCustType() {
            return this.custType;
        }

        public QueryInstanceResponseBodyData setFacebookBmId(String facebookBmId) {
            this.facebookBmId = facebookBmId;
            return this;
        }
        public String getFacebookBmId() {
            return this.facebookBmId;
        }

        public QueryInstanceResponseBodyData setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public QueryInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryInstanceResponseBodyData setIsvTerms(String isvTerms) {
            this.isvTerms = isvTerms;
            return this;
        }
        public String getIsvTerms() {
            return this.isvTerms;
        }

        public QueryInstanceResponseBodyData setOfficeAddress(String officeAddress) {
            this.officeAddress = officeAddress;
            return this;
        }
        public String getOfficeAddress() {
            return this.officeAddress;
        }

        public QueryInstanceResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public QueryInstanceResponseBodyData setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public QueryInstanceResponseBodyData setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

}
