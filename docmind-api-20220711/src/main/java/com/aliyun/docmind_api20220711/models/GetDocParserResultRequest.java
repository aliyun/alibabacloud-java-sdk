// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocParserResultRequest extends TeaModel {
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

    public static GetDocParserResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocParserResultRequest self = new GetDocParserResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDocParserResultRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetDocParserResultRequest setLayoutNum(Integer layoutNum) {
        this.layoutNum = layoutNum;
        return this;
    }
    public Integer getLayoutNum() {
        return this.layoutNum;
    }

    public GetDocParserResultRequest setLayoutStepSize(Integer layoutStepSize) {
        this.layoutStepSize = layoutStepSize;
        return this;
    }
    public Integer getLayoutStepSize() {
        return this.layoutStepSize;
    }

}
