// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class EventMatchRule extends TeaModel {
    /**
     * <p>Specifies whether to match.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MatchState")
    public Boolean matchState;

    /**
     * <p>The full name to match.</p>
     * 
     * <strong>example:</strong>
     * <p>testBucket/folder1/file1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The prefix to match.</p>
     * 
     * <strong>example:</strong>
     * <p>testBucket/prefix1xxx</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The suffix to match.</p>
     * 
     * <strong>example:</strong>
     * <p>suffix/xxxx.test</p>
     */
    @NameInMap("Suffix")
    public String suffix;

    public static EventMatchRule build(java.util.Map<String, ?> map) throws Exception {
        EventMatchRule self = new EventMatchRule();
        return TeaModel.build(map, self);
    }

    public EventMatchRule setMatchState(Boolean matchState) {
        this.matchState = matchState;
        return this;
    }
    public Boolean getMatchState() {
        return this.matchState;
    }

    public EventMatchRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EventMatchRule setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public EventMatchRule setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

}
