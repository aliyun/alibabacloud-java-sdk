// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512.models;

import com.aliyun.tea.*;

public class ProductBindBsnResponseBody extends TeaModel {
    @NameInMap("datas")
    public ProductBindBsnResponseBodyDatas datas;

    /**
     * <strong>example:</strong>
     * <p>21ED07AF-267E-5820-AEE5-53C973BFD5F8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ProductBindBsnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProductBindBsnResponseBody self = new ProductBindBsnResponseBody();
        return TeaModel.build(map, self);
    }

    public ProductBindBsnResponseBody setDatas(ProductBindBsnResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public ProductBindBsnResponseBodyDatas getDatas() {
        return this.datas;
    }

    public ProductBindBsnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ProductBindBsnResponseBodyDatas extends TeaModel {
        @NameInMap("bsnDO")
        public java.util.List<String> bsnDO;

        public static ProductBindBsnResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            ProductBindBsnResponseBodyDatas self = new ProductBindBsnResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public ProductBindBsnResponseBodyDatas setBsnDO(java.util.List<String> bsnDO) {
            this.bsnDO = bsnDO;
            return this;
        }
        public java.util.List<String> getBsnDO() {
            return this.bsnDO;
        }

    }

}
