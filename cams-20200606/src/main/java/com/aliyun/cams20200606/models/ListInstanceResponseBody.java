// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p><code>OK</code> indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see the <a href="https://help.aliyun.com/document_detail/196974.html">Error Code List</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>An array of objects, each representing an instance.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListInstanceResponseBodyData> data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2993*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded.</p>
     * <ul>
     * <li><p><strong>true</strong>: The call succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries that match the specified criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceResponseBody setData(java.util.List<ListInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstanceResponseBodyData> getData() {
        return this.data;
    }

    public ListInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListInstanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceResponseBodyData extends TeaModel {
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
         * <p>ma**@gmail.com</p>
         */
        @NameInMap("ContactMail")
        public String contactMail;

        /**
         * <p>The country ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        /**
         * <p>The customer space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dad-gf**</p>
         */
        @NameInMap("CustSpaceId")
        public String custSpaceId;

        /**
         * <p>The ID of the associated Facebook Business Manager account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FacebookBmId")
        public String facebookBmId;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>ins</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>29339****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
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
         * <p>aa</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the region where the resource is located.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The state of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>published</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the instance was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-12 00:00:00</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        public static ListInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyData self = new ListInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyData setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public ListInstanceResponseBodyData setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public ListInstanceResponseBodyData setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public ListInstanceResponseBodyData setCustSpaceId(String custSpaceId) {
            this.custSpaceId = custSpaceId;
            return this;
        }
        public String getCustSpaceId() {
            return this.custSpaceId;
        }

        public ListInstanceResponseBodyData setFacebookBmId(String facebookBmId) {
            this.facebookBmId = facebookBmId;
            return this;
        }
        public String getFacebookBmId() {
            return this.facebookBmId;
        }

        public ListInstanceResponseBodyData setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public ListInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstanceResponseBodyData setIsvTerms(String isvTerms) {
            this.isvTerms = isvTerms;
            return this;
        }
        public String getIsvTerms() {
            return this.isvTerms;
        }

        public ListInstanceResponseBodyData setOfficeAddress(String officeAddress) {
            this.officeAddress = officeAddress;
            return this;
        }
        public String getOfficeAddress() {
            return this.officeAddress;
        }

        public ListInstanceResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstanceResponseBodyData setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public ListInstanceResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListInstanceResponseBodyData setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

}
