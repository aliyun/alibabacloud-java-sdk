// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512.models;

import com.aliyun.tea.*;

public class GetBsnByResourceResponseBody extends TeaModel {
    @NameInMap("datas")
    public GetBsnByResourceResponseBodyDatas datas;

    public static GetBsnByResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBsnByResourceResponseBody self = new GetBsnByResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBsnByResourceResponseBody setDatas(GetBsnByResourceResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBsnByResourceResponseBodyDatas getDatas() {
        return this.datas;
    }

    public static class GetBsnByResourceResponseBodyDatas extends TeaModel {
        @NameInMap("bsnDO")
        public java.util.List<String> bsnDO;

        public static GetBsnByResourceResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBsnByResourceResponseBodyDatas self = new GetBsnByResourceResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBsnByResourceResponseBodyDatas setBsnDO(java.util.List<String> bsnDO) {
            this.bsnDO = bsnDO;
            return this;
        }
        public java.util.List<String> getBsnDO() {
            return this.bsnDO;
        }

    }

}
