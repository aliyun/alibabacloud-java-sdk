// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetCredentialReportResponseBody extends TeaModel {
    /**
     * <p>The content of the user credential report.</p>
     * <p>The report is Base64-encoded. After you decode the report, the credential report is in the CSV format.</p>
     * 
     * <strong>example:</strong>
     * <p>OVZWK4RMOVZW****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The time when the user credential report was generated.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-19T15:06:52Z</p>
     */
    @NameInMap("GeneratedTime")
    public String generatedTime;

    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public String isTruncated;

    /**
     * <p>The parameter that is used to obtain the truncated part. This parameter takes effect only when <code>IsTruncated</code> is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7A01826E-7601-44B0-B4DF-2B0C509836DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCredentialReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialReportResponseBody self = new GetCredentialReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCredentialReportResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetCredentialReportResponseBody setGeneratedTime(String generatedTime) {
        this.generatedTime = generatedTime;
        return this;
    }
    public String getGeneratedTime() {
        return this.generatedTime;
    }

    public GetCredentialReportResponseBody setIsTruncated(String isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public String getIsTruncated() {
        return this.isTruncated;
    }

    public GetCredentialReportResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetCredentialReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
