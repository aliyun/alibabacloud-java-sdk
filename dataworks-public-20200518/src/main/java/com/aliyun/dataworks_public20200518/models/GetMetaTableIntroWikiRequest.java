// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableIntroWikiRequest extends TeaModel {
    /**
     * <p>The GUID of the metatable.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The version of the instructions.</p>
     */
    @NameInMap("WikiVersion")
    public Long wikiVersion;

    public static GetMetaTableIntroWikiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableIntroWikiRequest self = new GetMetaTableIntroWikiRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableIntroWikiRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableIntroWikiRequest setWikiVersion(Long wikiVersion) {
        this.wikiVersion = wikiVersion;
        return this;
    }
    public Long getWikiVersion() {
        return this.wikiVersion;
    }

}
