// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class EventMatchRule extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MatchState")
    public Boolean matchState;

    @NameInMap("Name")
    public String name;

    @NameInMap("Prefix")
    public String prefix;

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
