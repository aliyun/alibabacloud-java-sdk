// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class CheckOssIncrementMetaExistResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckOssIncrementMetaExistResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckOssIncrementMetaExistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckOssIncrementMetaExistResponseBody self = new CheckOssIncrementMetaExistResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckOssIncrementMetaExistResponseBody setData(CheckOssIncrementMetaExistResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckOssIncrementMetaExistResponseBodyData getData() {
        return this.data;
    }

    public CheckOssIncrementMetaExistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckOssIncrementMetaExistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckOssIncrementMetaExistResponseBodyData extends TeaModel {
        @NameInMap("Exist")
        public Boolean exist;

        public static CheckOssIncrementMetaExistResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckOssIncrementMetaExistResponseBodyData self = new CheckOssIncrementMetaExistResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckOssIncrementMetaExistResponseBodyData setExist(Boolean exist) {
            this.exist = exist;
            return this;
        }
        public Boolean getExist() {
            return this.exist;
        }

    }

}
