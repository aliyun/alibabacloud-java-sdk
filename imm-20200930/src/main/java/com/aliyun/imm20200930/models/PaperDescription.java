// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class PaperDescription extends TeaModel {
    /**
     * <p>The guide result.</p>
     */
    @NameInMap("Description")
    public java.util.List<Summary> description;

    /**
     * <p>The section heading included in the guide result.</p>
     */
    @NameInMap("TitleID")
    public java.util.List<String> titleID;

    public static PaperDescription build(java.util.Map<String, ?> map) throws Exception {
        PaperDescription self = new PaperDescription();
        return TeaModel.build(map, self);
    }

    public PaperDescription setDescription(java.util.List<Summary> description) {
        this.description = description;
        return this;
    }
    public java.util.List<Summary> getDescription() {
        return this.description;
    }

    public PaperDescription setTitleID(java.util.List<String> titleID) {
        this.titleID = titleID;
        return this;
    }
    public java.util.List<String> getTitleID() {
        return this.titleID;
    }

}
