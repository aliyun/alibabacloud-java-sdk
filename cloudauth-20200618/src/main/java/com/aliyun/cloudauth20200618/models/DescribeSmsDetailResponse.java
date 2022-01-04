// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class DescribeSmsDetailResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItem")
    @Validation(required = true)
    public Integer totalItem;

    @NameInMap("TotalPage")
    @Validation(required = true)
    public Integer totalPage;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<DescribeSmsDetailResponseItems> items;

    public static DescribeSmsDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsDetailResponse self = new DescribeSmsDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmsDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSmsDetailResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSmsDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSmsDetailResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSmsDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmsDetailResponse setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSmsDetailResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeSmsDetailResponse setItems(java.util.List<DescribeSmsDetailResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSmsDetailResponseItems> getItems() {
        return this.items;
    }

    public static class DescribeSmsDetailResponseItems extends TeaModel {
        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Mobile")
        @Validation(required = true)
        public String mobile;

        @NameInMap("OuterOrderNo")
        @Validation(required = true)
        public String outerOrderNo;

        @NameInMap("ReceiveDate")
        @Validation(required = true)
        public String receiveDate;

        @NameInMap("SendDate")
        @Validation(required = true)
        public String sendDate;

        @NameInMap("SendStatus")
        @Validation(required = true)
        public String sendStatus;

        @NameInMap("SignName")
        @Validation(required = true)
        public String signName;

        @NameInMap("SmsSize")
        @Validation(required = true)
        public Integer smsSize;

        @NameInMap("TaskDate")
        @Validation(required = true)
        public String taskDate;

        @NameInMap("TemplateCode")
        @Validation(required = true)
        public String templateCode;

        public static DescribeSmsDetailResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmsDetailResponseItems self = new DescribeSmsDetailResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeSmsDetailResponseItems setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeSmsDetailResponseItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeSmsDetailResponseItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSmsDetailResponseItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSmsDetailResponseItems setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public DescribeSmsDetailResponseItems setOuterOrderNo(String outerOrderNo) {
            this.outerOrderNo = outerOrderNo;
            return this;
        }
        public String getOuterOrderNo() {
            return this.outerOrderNo;
        }

        public DescribeSmsDetailResponseItems setReceiveDate(String receiveDate) {
            this.receiveDate = receiveDate;
            return this;
        }
        public String getReceiveDate() {
            return this.receiveDate;
        }

        public DescribeSmsDetailResponseItems setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public DescribeSmsDetailResponseItems setSendStatus(String sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public String getSendStatus() {
            return this.sendStatus;
        }

        public DescribeSmsDetailResponseItems setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public DescribeSmsDetailResponseItems setSmsSize(Integer smsSize) {
            this.smsSize = smsSize;
            return this;
        }
        public Integer getSmsSize() {
            return this.smsSize;
        }

        public DescribeSmsDetailResponseItems setTaskDate(String taskDate) {
            this.taskDate = taskDate;
            return this;
        }
        public String getTaskDate() {
            return this.taskDate;
        }

        public DescribeSmsDetailResponseItems setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

}
