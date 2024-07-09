// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCdsFileShareLinksResponseBody extends TeaModel {
    /**
     * <p>The operation result. A value of success indicates that the operation is successful. If the operation failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data information.</p>
     */
    @NameInMap("Data")
    public java.util.List<CdsFileShareLinkModel> data;

    /**
     * <p>The error message that is returned. This parameter is not returned if the value of Code is <code>success</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6mnFXZiT7NdvGNgkInJ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCdsFileShareLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdsFileShareLinksResponseBody self = new DescribeCdsFileShareLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdsFileShareLinksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCdsFileShareLinksResponseBody setData(java.util.List<CdsFileShareLinkModel> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CdsFileShareLinkModel> getData() {
        return this.data;
    }

    public DescribeCdsFileShareLinksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCdsFileShareLinksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCdsFileShareLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdsFileShareLinksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
