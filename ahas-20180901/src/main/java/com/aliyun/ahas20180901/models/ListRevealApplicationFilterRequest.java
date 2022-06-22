// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListRevealApplicationFilterRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ViewId")
    public String viewId;

    public static ListRevealApplicationFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRevealApplicationFilterRequest self = new ListRevealApplicationFilterRequest();
        return TeaModel.build(map, self);
    }

    public ListRevealApplicationFilterRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListRevealApplicationFilterRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
