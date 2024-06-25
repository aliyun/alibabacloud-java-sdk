// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsSignResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The date and time when the signature was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-08 16:44:13</p>
     */
    @NameInMap("CreateDate")
    public String createDate;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The remarks of the review. Valid values:</p>
     * <ul>
     * <li>If the signature is in the <strong>Approved</strong> or <strong>Pending Approval</strong> state, No Remarks is returned.</li>
     * <li>If the signature is in the <strong>Not Approved</strong> state, the reason why the signature is rejected is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The document cannot verify the authenticity of the information. Please upload it again.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CC89A90C-978F-46AC-B80D-54738371E7CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The signature.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The status of the signature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The signature is pending approval.</li>
     * <li><strong>1</strong>: The signature is approved.</li>
     * <li><strong>2</strong>: The signature is rejected. The Reason parameter indicates the reason why the signature is rejected.</li>
     * <li><strong>10</strong>: The signature is cancelled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SignStatus")
    public Integer signStatus;

    public static QuerySmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignResponseBody self = new QuerySmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsSignResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public QuerySmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsSignResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public QuerySmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsSignResponseBody setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySmsSignResponseBody setSignStatus(Integer signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public Integer getSignStatus() {
        return this.signStatus;
    }

}
