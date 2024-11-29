// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCiphersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("CiphersGroup")
    public String ciphersGroup;

    /**
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<String> result;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCiphersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCiphersResponseBody self = new ListCiphersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCiphersResponseBody setCiphersGroup(String ciphersGroup) {
        this.ciphersGroup = ciphersGroup;
        return this;
    }
    public String getCiphersGroup() {
        return this.ciphersGroup;
    }

    public ListCiphersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCiphersResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

    public ListCiphersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
