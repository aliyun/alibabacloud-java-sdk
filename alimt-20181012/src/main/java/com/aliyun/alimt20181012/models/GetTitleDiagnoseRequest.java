// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleDiagnoseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("Extra")
    public String extra;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    public static GetTitleDiagnoseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTitleDiagnoseRequest self = new GetTitleDiagnoseRequest();
        return TeaModel.build(map, self);
    }

    public GetTitleDiagnoseRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public GetTitleDiagnoseRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public GetTitleDiagnoseRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetTitleDiagnoseRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetTitleDiagnoseRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
