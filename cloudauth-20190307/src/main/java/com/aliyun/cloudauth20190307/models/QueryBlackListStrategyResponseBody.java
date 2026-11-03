// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryBlackListStrategyResponseBody extends TeaModel {
    /**
     * <p>The return code. <strong>200</strong> indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<QueryBlackListStrategyResponseBodyResultObject> resultObject;

    public static QueryBlackListStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBlackListStrategyResponseBody self = new QueryBlackListStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBlackListStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBlackListStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBlackListStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBlackListStrategyResponseBody setResultObject(java.util.List<QueryBlackListStrategyResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<QueryBlackListStrategyResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class QueryBlackListStrategyResponseBodyResultObject extends TeaModel {
        /**
         * <p>The blacklist string. Items in the blacklist are separated by <strong>commas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1,127.0.0.2</p>
         */
        @NameInMap("BizContent")
        public String bizContent;

        /**
         * <p>The list type. Valid values:</p>
         * <ul>
         * <li>mobile: The mobile phone number blocklist.</li>
         * <li>ip: The IP address blocklist.</li>
         * <li>identifyNum: The ID card blocklist.</li>
         * <li>bankCard: The bank card blocklist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>identifyNum</p>
         */
        @NameInMap("BizKey")
        public String bizKey;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1711533786000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234822</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The product name. Valid values:</p>
         * <ul>
         * <li>id2meta: ID card two-element verification</li>
         * <li>mobile3Meta: mobile phone number element verification</li>
         * <li>bankcardMeta: bank card element verification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>id2meta</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><strong>disabled</strong>: disabled</li>
         * <li><strong>normal</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12600512xxxxxxxx</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static QueryBlackListStrategyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            QueryBlackListStrategyResponseBodyResultObject self = new QueryBlackListStrategyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public QueryBlackListStrategyResponseBodyResultObject setBizContent(String bizContent) {
            this.bizContent = bizContent;
            return this;
        }
        public String getBizContent() {
            return this.bizContent;
        }

        public QueryBlackListStrategyResponseBodyResultObject setBizKey(String bizKey) {
            this.bizKey = bizKey;
            return this;
        }
        public String getBizKey() {
            return this.bizKey;
        }

        public QueryBlackListStrategyResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryBlackListStrategyResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryBlackListStrategyResponseBodyResultObject setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryBlackListStrategyResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryBlackListStrategyResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
