// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryInstanceResponseBody extends TeaModel {
    /**
     * <p>The detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p><code>OK</code> indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error code list</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data object returned on a successful request.</p>
     */
    @NameInMap("Data")
    public QueryInstanceResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>29kskkd******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>VIBER</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <p>The contact email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:1@alibaba.com">1@alibaba.com</a></p>
         */
        @NameInMap("ContactMail")
        public String contactMail;

        /**
         * <p>The country ID.</p>
         * <blockquote>
         * <p>For a list of country codes, see <a href="https://help.aliyun.com/document_detail/608210.html">Country codes</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        /**
         * <p>The customer type.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("CustType")
        public String custType;

        /**
         * <p>The Facebook Business Manager ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39929****</p>
         */
        @NameInMap("FacebookBmId")
        public String facebookBmId;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ins</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>293939*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>viber_ins</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ISV terms.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alibaba.com/1.pdf">https://alibaba.com/1.pdf</a></p>
         */
        @NameInMap("IsvTerms")
        public String isvTerms;

        /**
         * <p>The office address.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("OfficeAddress")
        public String officeAddress;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The submission time.</p>
         * 
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
