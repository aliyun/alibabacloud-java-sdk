// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListReportDefinitionsRequest extends TeaModel {
    /**
     * <p>Primary sales site ID. If empty, the current user\&quot;s site ID is used by default</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static ListReportDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReportDefinitionsRequest self = new ListReportDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListReportDefinitionsRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
