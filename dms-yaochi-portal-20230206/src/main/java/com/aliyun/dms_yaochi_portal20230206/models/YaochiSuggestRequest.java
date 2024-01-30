// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class YaochiSuggestRequest extends TeaModel {
    @NameInMap("SuggestText")
    public String suggestText;

    public static YaochiSuggestRequest build(java.util.Map<String, ?> map) throws Exception {
        YaochiSuggestRequest self = new YaochiSuggestRequest();
        return TeaModel.build(map, self);
    }

    public YaochiSuggestRequest setSuggestText(String suggestText) {
        this.suggestText = suggestText;
        return this;
    }
    public String getSuggestText() {
        return this.suggestText;
    }

}
