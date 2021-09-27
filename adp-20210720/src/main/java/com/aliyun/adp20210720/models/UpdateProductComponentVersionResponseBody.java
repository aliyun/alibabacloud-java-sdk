// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductComponentVersionResponseBody extends TeaModel {
    @NameInMap("msg")
    public String msg;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateProductComponentVersionResponseBodyData data;

    public static UpdateProductComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductComponentVersionResponseBody self = new UpdateProductComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductComponentVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UpdateProductComponentVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProductComponentVersionResponseBody setData(UpdateProductComponentVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateProductComponentVersionResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateProductComponentVersionResponseBodyData extends TeaModel {
        @NameInMap("relationUID")
        public String relationUID;

        public static UpdateProductComponentVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateProductComponentVersionResponseBodyData self = new UpdateProductComponentVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateProductComponentVersionResponseBodyData setRelationUID(String relationUID) {
            this.relationUID = relationUID;
            return this;
        }
        public String getRelationUID() {
            return this.relationUID;
        }

    }

}
