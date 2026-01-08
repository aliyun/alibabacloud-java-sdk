// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
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
    public java.util.List<ListInstanceResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2993*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
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
         * <strong>example:</strong>
         * <p>VIBER</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <strong>example:</strong>
         * <p>ma**@gmail.com</p>
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
         * <p>dad-gf**</p>
         */
        @NameInMap("CustSpaceId")
        public String custSpaceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>29339****</p>
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
         * <p>aa</p>
         */
        @NameInMap("IsvTerms")
        public String isvTerms;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("OfficeAddress")
        public String officeAddress;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>published</p>
         */
        @NameInMap("State")
        public String state;

        /**
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
