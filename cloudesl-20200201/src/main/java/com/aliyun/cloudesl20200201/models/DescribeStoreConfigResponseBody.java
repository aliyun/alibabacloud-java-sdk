// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoreConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StoreConfigInfo")
    public DescribeStoreConfigResponseBodyStoreConfigInfo storeConfigInfo;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeStoreConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoreConfigResponseBody self = new DescribeStoreConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStoreConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeStoreConfigResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeStoreConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeStoreConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeStoreConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeStoreConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStoreConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStoreConfigResponseBody setStoreConfigInfo(DescribeStoreConfigResponseBodyStoreConfigInfo storeConfigInfo) {
        this.storeConfigInfo = storeConfigInfo;
        return this;
    }
    public DescribeStoreConfigResponseBodyStoreConfigInfo getStoreConfigInfo() {
        return this.storeConfigInfo;
    }

    public DescribeStoreConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents extends TeaModel {
        @NameInMap("AtAll")
        public Boolean atAll;

        @NameInMap("AtMobileList")
        public String atMobileList;

        @NameInMap("Category")
        public String category;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Threshold")
        public String threshold;

        public static DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents self = new DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents();
            return TeaModel.build(map, self);
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents setAtAll(Boolean atAll) {
            this.atAll = atAll;
            return this;
        }
        public Boolean getAtAll() {
            return this.atAll;
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents setAtMobileList(String atMobileList) {
            this.atMobileList = atMobileList;
            return this;
        }
        public String getAtMobileList() {
            return this.atMobileList;
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeStoreConfigResponseBodyStoreConfigInfo extends TeaModel {
        @NameInMap("EnableNotification")
        public Boolean enableNotification;

        @NameInMap("NotificationSilentTimes")
        public String notificationSilentTimes;

        @NameInMap("NotificationWebHook")
        public String notificationWebHook;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("SubscribeContents")
        public java.util.List<DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents> subscribeContents;

        public static DescribeStoreConfigResponseBodyStoreConfigInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoreConfigResponseBodyStoreConfigInfo self = new DescribeStoreConfigResponseBodyStoreConfigInfo();
            return TeaModel.build(map, self);
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfo setEnableNotification(Boolean enableNotification) {
            this.enableNotification = enableNotification;
            return this;
        }
        public Boolean getEnableNotification() {
            return this.enableNotification;
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfo setNotificationSilentTimes(String notificationSilentTimes) {
            this.notificationSilentTimes = notificationSilentTimes;
            return this;
        }
        public String getNotificationSilentTimes() {
            return this.notificationSilentTimes;
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfo setNotificationWebHook(String notificationWebHook) {
            this.notificationWebHook = notificationWebHook;
            return this;
        }
        public String getNotificationWebHook() {
            return this.notificationWebHook;
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfo setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public DescribeStoreConfigResponseBodyStoreConfigInfo setSubscribeContents(java.util.List<DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents> subscribeContents) {
            this.subscribeContents = subscribeContents;
            return this;
        }
        public java.util.List<DescribeStoreConfigResponseBodyStoreConfigInfoSubscribeContents> getSubscribeContents() {
            return this.subscribeContents;
        }

    }

}
