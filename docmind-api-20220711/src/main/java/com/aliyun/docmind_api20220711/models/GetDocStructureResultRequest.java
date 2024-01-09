// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocStructureResultRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ImageStrategy")
    public String imageStrategy;

    @NameInMap("RevealMarkdown")
    public Boolean revealMarkdown;

    public static GetDocStructureResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocStructureResultRequest self = new GetDocStructureResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDocStructureResultRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetDocStructureResultRequest setImageStrategy(String imageStrategy) {
        this.imageStrategy = imageStrategy;
        return this;
    }
    public String getImageStrategy() {
        return this.imageStrategy;
    }

    public GetDocStructureResultRequest setRevealMarkdown(Boolean revealMarkdown) {
        this.revealMarkdown = revealMarkdown;
        return this;
    }
    public Boolean getRevealMarkdown() {
        return this.revealMarkdown;
    }

}
