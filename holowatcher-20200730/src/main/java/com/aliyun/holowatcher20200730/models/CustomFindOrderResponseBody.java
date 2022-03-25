// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomFindOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public CustomFindOrderResponseBodyResultObj resultObj;

    @NameInMap("Success")
    public Boolean success;

    public static CustomFindOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomFindOrderResponseBody self = new CustomFindOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomFindOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CustomFindOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CustomFindOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CustomFindOrderResponseBody setResultObj(CustomFindOrderResponseBodyResultObj resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public CustomFindOrderResponseBodyResultObj getResultObj() {
        return this.resultObj;
    }

    public CustomFindOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CustomFindOrderResponseBodyResultObjContent extends TeaModel {
        @NameInMap("CipherId")
        public String cipherId;

        @NameInMap("CipherProjectId")
        public String cipherProjectId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("OrderName")
        public String orderName;

        @NameInMap("OrderState")
        public String orderState;

        public static CustomFindOrderResponseBodyResultObjContent build(java.util.Map<String, ?> map) throws Exception {
            CustomFindOrderResponseBodyResultObjContent self = new CustomFindOrderResponseBodyResultObjContent();
            return TeaModel.build(map, self);
        }

        public CustomFindOrderResponseBodyResultObjContent setCipherId(String cipherId) {
            this.cipherId = cipherId;
            return this;
        }
        public String getCipherId() {
            return this.cipherId;
        }

        public CustomFindOrderResponseBodyResultObjContent setCipherProjectId(String cipherProjectId) {
            this.cipherProjectId = cipherProjectId;
            return this;
        }
        public String getCipherProjectId() {
            return this.cipherProjectId;
        }

        public CustomFindOrderResponseBodyResultObjContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CustomFindOrderResponseBodyResultObjContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CustomFindOrderResponseBodyResultObjContent setOrderName(String orderName) {
            this.orderName = orderName;
            return this;
        }
        public String getOrderName() {
            return this.orderName;
        }

        public CustomFindOrderResponseBodyResultObjContent setOrderState(String orderState) {
            this.orderState = orderState;
            return this;
        }
        public String getOrderState() {
            return this.orderState;
        }

    }

    public static class CustomFindOrderResponseBodyResultObj extends TeaModel {
        @NameInMap("Content")
        public java.util.List<CustomFindOrderResponseBodyResultObjContent> content;

        @NameInMap("Size")
        public Long size;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Long totalPages;

        public static CustomFindOrderResponseBodyResultObj build(java.util.Map<String, ?> map) throws Exception {
            CustomFindOrderResponseBodyResultObj self = new CustomFindOrderResponseBodyResultObj();
            return TeaModel.build(map, self);
        }

        public CustomFindOrderResponseBodyResultObj setContent(java.util.List<CustomFindOrderResponseBodyResultObjContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<CustomFindOrderResponseBodyResultObjContent> getContent() {
            return this.content;
        }

        public CustomFindOrderResponseBodyResultObj setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public CustomFindOrderResponseBodyResultObj setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public CustomFindOrderResponseBodyResultObj setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}
