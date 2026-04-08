// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsDataSourceConfigItemsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    public static ListMmsDataSourceConfigItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsDataSourceConfigItemsRequest self = new ListMmsDataSourceConfigItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsDataSourceConfigItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListMmsDataSourceConfigItemsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
