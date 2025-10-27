// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocParserResultShrinkRequest extends TeaModel {
    @NameInMap("ExcludeFields")
    public String excludeFieldsShrink;

    /**
     * <strong>example:</strong>
     * <p>docmind-20220816-1e89d65c</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("LayoutNum")
    public Integer layoutNum;

    @NameInMap("LayoutStepSize")
    public Integer layoutStepSize;

    public static GetDocParserResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocParserResultShrinkRequest self = new GetDocParserResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDocParserResultShrinkRequest setExcludeFieldsShrink(String excludeFieldsShrink) {
        this.excludeFieldsShrink = excludeFieldsShrink;
        return this;
    }
    public String getExcludeFieldsShrink() {
        return this.excludeFieldsShrink;
    }

    public GetDocParserResultShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetDocParserResultShrinkRequest setLayoutNum(Integer layoutNum) {
        this.layoutNum = layoutNum;
        return this;
    }
    public Integer getLayoutNum() {
        return this.layoutNum;
    }

    public GetDocParserResultShrinkRequest setLayoutStepSize(Integer layoutStepSize) {
        this.layoutStepSize = layoutStepSize;
        return this;
    }
    public Integer getLayoutStepSize() {
        return this.layoutStepSize;
    }

}
