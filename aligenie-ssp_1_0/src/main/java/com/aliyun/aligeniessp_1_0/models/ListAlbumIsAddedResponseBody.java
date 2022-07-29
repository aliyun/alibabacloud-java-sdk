// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlbumIsAddedResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListAlbumIsAddedResponseBodyResult> result;

    public static ListAlbumIsAddedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumIsAddedResponseBody self = new ListAlbumIsAddedResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlbumIsAddedResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAlbumIsAddedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlbumIsAddedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlbumIsAddedResponseBody setResult(java.util.List<ListAlbumIsAddedResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAlbumIsAddedResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAlbumIsAddedResponseBodyResult extends TeaModel {
        @NameInMap("AlbumId")
        public String albumId;

        @NameInMap("IsAdded")
        public String isAdded;

        public static ListAlbumIsAddedResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumIsAddedResponseBodyResult self = new ListAlbumIsAddedResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAlbumIsAddedResponseBodyResult setAlbumId(String albumId) {
            this.albumId = albumId;
            return this;
        }
        public String getAlbumId() {
            return this.albumId;
        }

        public ListAlbumIsAddedResponseBodyResult setIsAdded(String isAdded) {
            this.isAdded = isAdded;
            return this;
        }
        public String getIsAdded() {
            return this.isAdded;
        }

    }

}
