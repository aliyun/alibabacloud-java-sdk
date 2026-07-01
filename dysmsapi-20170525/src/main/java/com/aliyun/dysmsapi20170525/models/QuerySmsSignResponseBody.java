// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsSignResponseBody extends TeaModel {
    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p><code>OK</code> indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The date and time when the SMS signature was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-08 16:44:13</p>
     */
    @NameInMap("CreateDate")
    public String createDate;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The review reason.</p>
     * <ul>
     * <li><p>If the review status is <strong>Approved</strong> or <strong>Pending Review</strong>, this parameter is empty.</p>
     * </li>
     * <li><p>If the review status is <strong>Rejected</strong>, this parameter provides the reason for the rejection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>文件不能证明信息真实性，请重新上传</p>
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
     * <p>The SMS signature.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The review status of the SMS signature. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Pending Review.</p>
     * </li>
     * <li><p><strong>1</strong>: Approved.</p>
     * </li>
     * <li><p><strong>2</strong>: Rejected. For details, see the <code>Reason</code> parameter.</p>
     * </li>
     * <li><p><strong>10</strong>: Canceled.</p>
     * </li>
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
