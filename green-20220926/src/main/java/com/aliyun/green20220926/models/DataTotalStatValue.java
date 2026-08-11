// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DataTotalStatValue extends TeaModel {
    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The proportion.</p>
     * 
     * <strong>example:</strong>
     * <p>12.50%</p>
     */
    @NameInMap("Share")
    public String share;

    public static DataTotalStatValue build(java.util.Map<String, ?> map) throws Exception {
        DataTotalStatValue self = new DataTotalStatValue();
        return TeaModel.build(map, self);
    }

    public DataTotalStatValue setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DataTotalStatValue setShare(String share) {
        this.share = share;
        return this;
    }
    public String getShare() {
        return this.share;
    }

}
