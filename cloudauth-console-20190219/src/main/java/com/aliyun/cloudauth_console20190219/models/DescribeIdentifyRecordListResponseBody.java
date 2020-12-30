// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeIdentifyRecordListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordList")
    public java.util.List<DescribeIdentifyRecordListResponseBodyRecordList> recordList;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeIdentifyRecordListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdentifyRecordListResponseBody self = new DescribeIdentifyRecordListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIdentifyRecordListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeIdentifyRecordListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIdentifyRecordListResponseBody setRecordList(java.util.List<DescribeIdentifyRecordListResponseBodyRecordList> recordList) {
        this.recordList = recordList;
        return this;
    }
    public java.util.List<DescribeIdentifyRecordListResponseBodyRecordList> getRecordList() {
        return this.recordList;
    }

    public DescribeIdentifyRecordListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeIdentifyRecordListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeIdentifyRecordListResponseBodyRecordList extends TeaModel {
        @NameInMap("CapturedImage")
        public String capturedImage;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UserId")
        public Integer userId;

        @NameInMap("IdentifyingImage")
        public String identifyingImage;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("IotId")
        public String iotId;

        public static DescribeIdentifyRecordListResponseBodyRecordList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIdentifyRecordListResponseBodyRecordList self = new DescribeIdentifyRecordListResponseBodyRecordList();
            return TeaModel.build(map, self);
        }

        public DescribeIdentifyRecordListResponseBodyRecordList setCapturedImage(String capturedImage) {
            this.capturedImage = capturedImage;
            return this;
        }
        public String getCapturedImage() {
            return this.capturedImage;
        }

        public DescribeIdentifyRecordListResponseBodyRecordList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeIdentifyRecordListResponseBodyRecordList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeIdentifyRecordListResponseBodyRecordList setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public DescribeIdentifyRecordListResponseBodyRecordList setIdentifyingImage(String identifyingImage) {
            this.identifyingImage = identifyingImage;
            return this;
        }
        public String getIdentifyingImage() {
            return this.identifyingImage;
        }

        public DescribeIdentifyRecordListResponseBodyRecordList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeIdentifyRecordListResponseBodyRecordList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeIdentifyRecordListResponseBodyRecordList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
