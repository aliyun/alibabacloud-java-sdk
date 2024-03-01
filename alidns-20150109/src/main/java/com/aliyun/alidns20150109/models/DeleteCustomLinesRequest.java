// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCustomLinesRequest extends TeaModel {
    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique IDs of the custom lines that you want to delete. Separate the unique IDs with commas (,).</p>
     */
    @NameInMap("LineIds")
    public String lineIds;

    public static DeleteCustomLinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomLinesRequest self = new DeleteCustomLinesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomLinesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteCustomLinesRequest setLineIds(String lineIds) {
        this.lineIds = lineIds;
        return this;
    }
    public String getLineIds() {
        return this.lineIds;
    }

}
