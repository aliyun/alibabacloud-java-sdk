// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListIdpConfigsResponseBody extends TeaModel {
    /**
     * <p>IdP configurations.</p>
     */
    @NameInMap("Data")
    public ListIdpConfigsResponseBodyData data;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>FD724DBC-CD76-5235-BF76-59C51B73296D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListIdpConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdpConfigsResponseBody self = new ListIdpConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdpConfigsResponseBody setData(ListIdpConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIdpConfigsResponseBodyData getData() {
        return this.data;
    }

    public ListIdpConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIdpConfigsResponseBodyDataDataList extends TeaModel {
        /**
         * <p>IdP configuration description.</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>IdP configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>277</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Multi-factor authentication (MFA) type.</p>
         * 
         * <strong>example:</strong>
         * <p>totp</p>
         */
        @NameInMap("Mfa")
        public String mfa;

        /**
         * <p>Mobile login type.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("MobileLoginType")
        public String mobileLoginType;

        /**
         * <p>Mobile MFA configuration type.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("MobileMfaConfigType")
        public String mobileMfaConfigType;

        /**
         * <p>List of multiple IdP configuration IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>1482,1355</p>
         */
        @NameInMap("MultiIdpInfo")
        public String multiIdpInfo;

        /**
         * <p>IdP configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>示例身份源</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>PC login type.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("PcLoginType")
        public String pcLoginType;

        /**
         * <p>IdP configuration enable status. Values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>IdP configuration type.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-09T02:22:41.430Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListIdpConfigsResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            ListIdpConfigsResponseBodyDataDataList self = new ListIdpConfigsResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public ListIdpConfigsResponseBodyDataDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIdpConfigsResponseBodyDataDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIdpConfigsResponseBodyDataDataList setMfa(String mfa) {
            this.mfa = mfa;
            return this;
        }
        public String getMfa() {
            return this.mfa;
        }

        public ListIdpConfigsResponseBodyDataDataList setMobileLoginType(String mobileLoginType) {
            this.mobileLoginType = mobileLoginType;
            return this;
        }
        public String getMobileLoginType() {
            return this.mobileLoginType;
        }

        public ListIdpConfigsResponseBodyDataDataList setMobileMfaConfigType(String mobileMfaConfigType) {
            this.mobileMfaConfigType = mobileMfaConfigType;
            return this;
        }
        public String getMobileMfaConfigType() {
            return this.mobileMfaConfigType;
        }

        public ListIdpConfigsResponseBodyDataDataList setMultiIdpInfo(String multiIdpInfo) {
            this.multiIdpInfo = multiIdpInfo;
            return this;
        }
        public String getMultiIdpInfo() {
            return this.multiIdpInfo;
        }

        public ListIdpConfigsResponseBodyDataDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIdpConfigsResponseBodyDataDataList setPcLoginType(String pcLoginType) {
            this.pcLoginType = pcLoginType;
            return this;
        }
        public String getPcLoginType() {
            return this.pcLoginType;
        }

        public ListIdpConfigsResponseBodyDataDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIdpConfigsResponseBodyDataDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListIdpConfigsResponseBodyDataDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListIdpConfigsResponseBodyData extends TeaModel {
        /**
         * <p>List of IdP configurations.</p>
         */
        @NameInMap("DataList")
        public java.util.List<ListIdpConfigsResponseBodyDataDataList> dataList;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Long totalNum;

        public static ListIdpConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIdpConfigsResponseBodyData self = new ListIdpConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIdpConfigsResponseBodyData setDataList(java.util.List<ListIdpConfigsResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListIdpConfigsResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public ListIdpConfigsResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
