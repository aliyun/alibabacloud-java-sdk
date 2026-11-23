// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class MosQueryRegistrationInfoResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MosQueryRegistrationInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MosQueryRegistrationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MosQueryRegistrationInfoResponseBody self = new MosQueryRegistrationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public MosQueryRegistrationInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public MosQueryRegistrationInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MosQueryRegistrationInfoResponseBody setData(MosQueryRegistrationInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MosQueryRegistrationInfoResponseBodyData getData() {
        return this.data;
    }

    public MosQueryRegistrationInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MosQueryRegistrationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MosQueryRegistrationInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MosQueryRegistrationInfoResponseBodyDataListTagInfos extends TeaModel {
        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagName")
        public String tagName;

        public static MosQueryRegistrationInfoResponseBodyDataListTagInfos build(java.util.Map<String, ?> map) throws Exception {
            MosQueryRegistrationInfoResponseBodyDataListTagInfos self = new MosQueryRegistrationInfoResponseBodyDataListTagInfos();
            return TeaModel.build(map, self);
        }

        public MosQueryRegistrationInfoResponseBodyDataListTagInfos setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public MosQueryRegistrationInfoResponseBodyDataListTagInfos setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class MosQueryRegistrationInfoResponseBodyDataList extends TeaModel {
        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("CheckinStatus")
        public String checkinStatus;

        @NameInMap("Id")
        public Long id;

        @NameInMap("QrCode")
        public String qrCode;

        @NameInMap("TagInfos")
        public java.util.List<MosQueryRegistrationInfoResponseBodyDataListTagInfos> tagInfos;

        @NameInMap("UserCompany")
        public String userCompany;

        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserPhone")
        public String userPhone;

        public static MosQueryRegistrationInfoResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            MosQueryRegistrationInfoResponseBodyDataList self = new MosQueryRegistrationInfoResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public MosQueryRegistrationInfoResponseBodyDataList setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public MosQueryRegistrationInfoResponseBodyDataList setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public MosQueryRegistrationInfoResponseBodyDataList setCheckinStatus(String checkinStatus) {
            this.checkinStatus = checkinStatus;
            return this;
        }
        public String getCheckinStatus() {
            return this.checkinStatus;
        }

        public MosQueryRegistrationInfoResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public MosQueryRegistrationInfoResponseBodyDataList setQrCode(String qrCode) {
            this.qrCode = qrCode;
            return this;
        }
        public String getQrCode() {
            return this.qrCode;
        }

        public MosQueryRegistrationInfoResponseBodyDataList setTagInfos(java.util.List<MosQueryRegistrationInfoResponseBodyDataListTagInfos> tagInfos) {
            this.tagInfos = tagInfos;
            return this;
        }
        public java.util.List<MosQueryRegistrationInfoResponseBodyDataListTagInfos> getTagInfos() {
            return this.tagInfos;
        }

        public MosQueryRegistrationInfoResponseBodyDataList setUserCompany(String userCompany) {
            this.userCompany = userCompany;
            return this;
        }
        public String getUserCompany() {
            return this.userCompany;
        }

        public MosQueryRegistrationInfoResponseBodyDataList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public MosQueryRegistrationInfoResponseBodyDataList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public MosQueryRegistrationInfoResponseBodyDataList setUserPhone(String userPhone) {
            this.userPhone = userPhone;
            return this;
        }
        public String getUserPhone() {
            return this.userPhone;
        }

    }

    public static class MosQueryRegistrationInfoResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<MosQueryRegistrationInfoResponseBodyDataList> list;

        @NameInMap("Total")
        public Long total;

        public static MosQueryRegistrationInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MosQueryRegistrationInfoResponseBodyData self = new MosQueryRegistrationInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MosQueryRegistrationInfoResponseBodyData setList(java.util.List<MosQueryRegistrationInfoResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<MosQueryRegistrationInfoResponseBodyDataList> getList() {
            return this.list;
        }

        public MosQueryRegistrationInfoResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
