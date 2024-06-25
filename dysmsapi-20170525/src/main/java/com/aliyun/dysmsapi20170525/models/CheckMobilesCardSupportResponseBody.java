// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CheckMobilesCardSupportResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CheckMobilesCardSupportResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>819BE656-D2E0-4858-8B21-B2E477085AAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckMobilesCardSupportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMobilesCardSupportResponseBody self = new CheckMobilesCardSupportResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMobilesCardSupportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckMobilesCardSupportResponseBody setData(CheckMobilesCardSupportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckMobilesCardSupportResponseBodyData getData() {
        return this.data;
    }

    public CheckMobilesCardSupportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMobilesCardSupportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckMobilesCardSupportResponseBodyDataQueryResult extends TeaModel {
        /**
         * <p>The mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("mobile")
        public String mobile;

        /**
         * <p>Indicates whether the mobile phone number supports card messages.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("support")
        public Boolean support;

        public static CheckMobilesCardSupportResponseBodyDataQueryResult build(java.util.Map<String, ?> map) throws Exception {
            CheckMobilesCardSupportResponseBodyDataQueryResult self = new CheckMobilesCardSupportResponseBodyDataQueryResult();
            return TeaModel.build(map, self);
        }

        public CheckMobilesCardSupportResponseBodyDataQueryResult setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public CheckMobilesCardSupportResponseBodyDataQueryResult setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

    }

    public static class CheckMobilesCardSupportResponseBodyData extends TeaModel {
        /**
         * <p>The list of returned results.</p>
         */
        @NameInMap("queryResult")
        public java.util.List<CheckMobilesCardSupportResponseBodyDataQueryResult> queryResult;

        public static CheckMobilesCardSupportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckMobilesCardSupportResponseBodyData self = new CheckMobilesCardSupportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckMobilesCardSupportResponseBodyData setQueryResult(java.util.List<CheckMobilesCardSupportResponseBodyDataQueryResult> queryResult) {
            this.queryResult = queryResult;
            return this;
        }
        public java.util.List<CheckMobilesCardSupportResponseBodyDataQueryResult> getQueryResult() {
            return this.queryResult;
        }

    }

}
