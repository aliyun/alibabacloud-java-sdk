// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListCollectionAccountInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("InfoDTOList")
    public java.util.List<CollectionAccountInfoDTO> infoDTOList;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCollectionAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionAccountInfoResponseBody self = new ListCollectionAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCollectionAccountInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCollectionAccountInfoResponseBody setInfoDTOList(java.util.List<CollectionAccountInfoDTO> infoDTOList) {
        this.infoDTOList = infoDTOList;
        return this;
    }
    public java.util.List<CollectionAccountInfoDTO> getInfoDTOList() {
        return this.infoDTOList;
    }

    public ListCollectionAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCollectionAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCollectionAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
