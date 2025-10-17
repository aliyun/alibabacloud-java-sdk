// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class QueryFaceRecordRequest extends TeaModel {
    /**
     * <p>Current Page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>Face Group Code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cu****D08q</p>
     */
    @NameInMap("FaceGroupCode")
    public String faceGroupCode;

    /**
     * <p>Face ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5006538</p>
     */
    @NameInMap("FaceId")
    public String faceId;

    /**
     * <p>Number of rows per page for paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Merchant User ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CuN6hiD08qr</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Used to request the next page of search results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh0OP1yH8z+7FV4KKGUw4X32</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Number of items per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Registration Type.</p>
     * 
     * <strong>example:</strong>
     * <p>MANUAL</p>
     */
    @NameInMap("RegistrationType")
    public String registrationType;

    public static QueryFaceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceRecordRequest self = new QueryFaceRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceRecordRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryFaceRecordRequest setFaceGroupCode(String faceGroupCode) {
        this.faceGroupCode = faceGroupCode;
        return this;
    }
    public String getFaceGroupCode() {
        return this.faceGroupCode;
    }

    public QueryFaceRecordRequest setFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }
    public String getFaceId() {
        return this.faceId;
    }

    public QueryFaceRecordRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryFaceRecordRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public QueryFaceRecordRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryFaceRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryFaceRecordRequest setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
        return this;
    }
    public String getRegistrationType() {
        return this.registrationType;
    }

}
