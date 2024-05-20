// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TextThemeListResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("textThemeList")
    public java.util.List<TextTheme> textThemeList;

    public static TextThemeListResult build(java.util.Map<String, ?> map) throws Exception {
        TextThemeListResult self = new TextThemeListResult();
        return TeaModel.build(map, self);
    }

    public TextThemeListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TextThemeListResult setTextThemeList(java.util.List<TextTheme> textThemeList) {
        this.textThemeList = textThemeList;
        return this;
    }
    public java.util.List<TextTheme> getTextThemeList() {
        return this.textThemeList;
    }

}
