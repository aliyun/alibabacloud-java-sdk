// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class RewriteConfig extends TeaModel {
    @NameInMap("equalRules")
    public java.util.List<RewriteConfigEqualRules> equalRules;

    @NameInMap("regexRules")
    public java.util.List<RewriteConfigRegexRules> regexRules;

    @NameInMap("wildcardRules")
    public java.util.List<RewriteConfigWildcardRules> wildcardRules;

    public static RewriteConfig build(java.util.Map<String, ?> map) throws Exception {
        RewriteConfig self = new RewriteConfig();
        return TeaModel.build(map, self);
    }

    public RewriteConfig setEqualRules(java.util.List<RewriteConfigEqualRules> equalRules) {
        this.equalRules = equalRules;
        return this;
    }
    public java.util.List<RewriteConfigEqualRules> getEqualRules() {
        return this.equalRules;
    }

    public RewriteConfig setRegexRules(java.util.List<RewriteConfigRegexRules> regexRules) {
        this.regexRules = regexRules;
        return this;
    }
    public java.util.List<RewriteConfigRegexRules> getRegexRules() {
        return this.regexRules;
    }

    public RewriteConfig setWildcardRules(java.util.List<RewriteConfigWildcardRules> wildcardRules) {
        this.wildcardRules = wildcardRules;
        return this;
    }
    public java.util.List<RewriteConfigWildcardRules> getWildcardRules() {
        return this.wildcardRules;
    }

    public static class RewriteConfigEqualRules extends TeaModel {
        @NameInMap("match")
        public String match;

        @NameInMap("replacement")
        public String replacement;

        public static RewriteConfigEqualRules build(java.util.Map<String, ?> map) throws Exception {
            RewriteConfigEqualRules self = new RewriteConfigEqualRules();
            return TeaModel.build(map, self);
        }

        public RewriteConfigEqualRules setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public RewriteConfigEqualRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class RewriteConfigRegexRules extends TeaModel {
        @NameInMap("match")
        public String match;

        @NameInMap("replacement")
        public String replacement;

        public static RewriteConfigRegexRules build(java.util.Map<String, ?> map) throws Exception {
            RewriteConfigRegexRules self = new RewriteConfigRegexRules();
            return TeaModel.build(map, self);
        }

        public RewriteConfigRegexRules setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public RewriteConfigRegexRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class RewriteConfigWildcardRules extends TeaModel {
        @NameInMap("match")
        public String match;

        @NameInMap("replacement")
        public String replacement;

        public static RewriteConfigWildcardRules build(java.util.Map<String, ?> map) throws Exception {
            RewriteConfigWildcardRules self = new RewriteConfigWildcardRules();
            return TeaModel.build(map, self);
        }

        public RewriteConfigWildcardRules setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public RewriteConfigWildcardRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

}
