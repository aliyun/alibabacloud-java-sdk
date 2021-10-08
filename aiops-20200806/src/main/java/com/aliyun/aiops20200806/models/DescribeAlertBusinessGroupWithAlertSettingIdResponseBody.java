// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertBusinessGroupWithAlertSettingIdResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Status")
    public String status;

    @NameInMap("Data")
    public java.util.List<DescribeAlertBusinessGroupWithAlertSettingIdResponseBodyData> data;

    public static DescribeAlertBusinessGroupWithAlertSettingIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertBusinessGroupWithAlertSettingIdResponseBody self = new DescribeAlertBusinessGroupWithAlertSettingIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponseBody setData(java.util.List<DescribeAlertBusinessGroupWithAlertSettingIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertBusinessGroupWithAlertSettingIdResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeAlertBusinessGroupWithAlertSettingIdResponseBodyData extends TeaModel {
        @NameInMap("BusinessGroupId")
        public String businessGroupId;

        @NameInMap("BusinessGroupName")
        public String businessGroupName;

        public static DescribeAlertBusinessGroupWithAlertSettingIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertBusinessGroupWithAlertSettingIdResponseBodyData self = new DescribeAlertBusinessGroupWithAlertSettingIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertBusinessGroupWithAlertSettingIdResponseBodyData setBusinessGroupId(String businessGroupId) {
            this.businessGroupId = businessGroupId;
            return this;
        }
        public String getBusinessGroupId() {
            return this.businessGroupId;
        }

        public DescribeAlertBusinessGroupWithAlertSettingIdResponseBodyData setBusinessGroupName(String businessGroupName) {
            this.businessGroupName = businessGroupName;
            return this;
        }
        public String getBusinessGroupName() {
            return this.businessGroupName;
        }

    }

}
