// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetLineSplitResultRequest extends TeaModel {
    @NameInMap("Line")
    public String line;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("Regex")
    public String regex;

    @NameInMap("SelectContent")
    public String selectContent;

    /**
     * <strong>example:</strong>
     * <p>simple|regex</p>
     */
    @NameInMap("SplitType")
    public String splitType;

    public static GetLineSplitResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLineSplitResultRequest self = new GetLineSplitResultRequest();
        return TeaModel.build(map, self);
    }

    public GetLineSplitResultRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public GetLineSplitResultRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public GetLineSplitResultRequest setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public GetLineSplitResultRequest setSelectContent(String selectContent) {
        this.selectContent = selectContent;
        return this;
    }
    public String getSelectContent() {
        return this.selectContent;
    }

    public GetLineSplitResultRequest setSplitType(String splitType) {
        this.splitType = splitType;
        return this;
    }
    public String getSplitType() {
        return this.splitType;
    }

}
