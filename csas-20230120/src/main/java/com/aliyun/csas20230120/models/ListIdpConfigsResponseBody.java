// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListIdpConfigsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListIdpConfigsResponseBodyData data;

    /**
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
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>277</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>totp</p>
         */
        @NameInMap("Mfa")
        public String mfa;

        /**
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("MobileLoginType")
        public String mobileLoginType;

        /**
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("MobileMfaConfigType")
        public String mobileMfaConfigType;

        /**
         * <strong>example:</strong>
         * <p>1482,1355</p>
         */
        @NameInMap("MultiIdpInfo")
        public String multiIdpInfo;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("PcLoginType")
        public String pcLoginType;

        /**
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
        @NameInMap("DataList")
        public java.util.List<ListIdpConfigsResponseBodyDataDataList> dataList;

        /**
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
