// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictsRequest extends TeaModel {
    /**
     * <p>The type of the dictionary. Valid values:</p>
     * <br>
     * <p>*   IK: IK dictionary after a standard update</p>
     * <p>*   IK_HOT: IK dictionary after a rolling update</p>
     * <p>*   SYNONYMS: synonym dictionary</p>
     * <p>*   ALIWS: Alibaba Cloud dictionary</p>
     */
    @NameInMap("analyzerType")
    public String analyzerType;

    /**
     * <p>The name of the dictionary file.</p>
     */
    @NameInMap("name")
    public String name;

    public static ListDictsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDictsRequest self = new ListDictsRequest();
        return TeaModel.build(map, self);
    }

    public ListDictsRequest setAnalyzerType(String analyzerType) {
        this.analyzerType = analyzerType;
        return this;
    }
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    public ListDictsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
