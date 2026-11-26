// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryScriptHotWordListRequest extends TeaModel {
    @NameInMap("hotWord")
    public String hotWord;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("scriptRecordId")
    public String scriptRecordId;

    public static QueryScriptHotWordListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScriptHotWordListRequest self = new QueryScriptHotWordListRequest();
        return TeaModel.build(map, self);
    }

    public QueryScriptHotWordListRequest setHotWord(String hotWord) {
        this.hotWord = hotWord;
        return this;
    }
    public String getHotWord() {
        return this.hotWord;
    }

    public QueryScriptHotWordListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryScriptHotWordListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryScriptHotWordListRequest setScriptRecordId(String scriptRecordId) {
        this.scriptRecordId = scriptRecordId;
        return this;
    }
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

}
