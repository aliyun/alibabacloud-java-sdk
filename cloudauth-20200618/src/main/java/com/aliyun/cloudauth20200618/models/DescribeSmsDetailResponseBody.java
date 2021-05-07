// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class DescribeSmsDetailResponseBody extends TeaModel {
    @NameInMap("TotalItem")
    public Integer totalItem;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Items")
    public java.util.List<DescribeSmsDetailResponseBodyItems> items;

    public static DescribeSmsDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsDetailResponseBody self = new DescribeSmsDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmsDetailResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSmsDetailResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSmsDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmsDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSmsDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSmsDetailResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeSmsDetailResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSmsDetailResponseBody setItems(java.util.List<DescribeSmsDetailResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSmsDetailResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeSmsDetailResponseBodyItems extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ReceiveDate")
        public String receiveDate;

        @NameInMap("SendDate")
        public String sendDate;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("TaskDate")
        public String taskDate;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("OuterOrderNo")
        public String outerOrderNo;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("SmsSize")
        public Integer smsSize;

        @NameInMap("Content")
        public String content;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("SendStatus")
        public String sendStatus;

        public static DescribeSmsDetailResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmsDetailResponseBodyItems self = new DescribeSmsDetailResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSmsDetailResponseBodyItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSmsDetailResponseBodyItems setReceiveDate(String receiveDate) {
            this.receiveDate = receiveDate;
            return this;
        }
        public String getReceiveDate() {
            return this.receiveDate;
        }

        public DescribeSmsDetailResponseBodyItems setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public DescribeSmsDetailResponseBodyItems setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeSmsDetailResponseBodyItems setTaskDate(String taskDate) {
            this.taskDate = taskDate;
            return this;
        }
        public String getTaskDate() {
            return this.taskDate;
        }

        public DescribeSmsDetailResponseBodyItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeSmsDetailResponseBodyItems setOuterOrderNo(String outerOrderNo) {
            this.outerOrderNo = outerOrderNo;
            return this;
        }
        public String getOuterOrderNo() {
            return this.outerOrderNo;
        }

        public DescribeSmsDetailResponseBodyItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSmsDetailResponseBodyItems setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public DescribeSmsDetailResponseBodyItems setSmsSize(Integer smsSize) {
            this.smsSize = smsSize;
            return this;
        }
        public Integer getSmsSize() {
            return this.smsSize;
        }

        public DescribeSmsDetailResponseBodyItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeSmsDetailResponseBodyItems setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public DescribeSmsDetailResponseBodyItems setSendStatus(String sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public String getSendStatus() {
            return this.sendStatus;
        }

    }

}
