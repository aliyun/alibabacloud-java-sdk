// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class BatchRevokeSeatsShrinkRequest extends TeaModel {
    /**
     * <p>The list of revocation items. This parameter is required.</p>
     */
    @NameInMap("Items")
    public String itemsShrink;

    /**
     * <p>The language. Valid values: zh-CN and en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Locale")
    public String locale;

    public static BatchRevokeSeatsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRevokeSeatsShrinkRequest self = new BatchRevokeSeatsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchRevokeSeatsShrinkRequest setItemsShrink(String itemsShrink) {
        this.itemsShrink = itemsShrink;
        return this;
    }
    public String getItemsShrink() {
        return this.itemsShrink;
    }

    public BatchRevokeSeatsShrinkRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
