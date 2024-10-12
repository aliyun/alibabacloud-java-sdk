// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class ResourceDef extends TeaModel {
    @NameInMap("AccessTypeRestrictions")
    public java.util.List<String> accessTypeRestrictions;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExcludesSupported")
    public Boolean excludesSupported;

    @NameInMap("IsValidLeaf")
    public Boolean isValidLeaf;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("Label")
    public String label;

    @NameInMap("Level")
    public Integer level;

    @NameInMap("LookupSupported")
    public Boolean lookupSupported;

    @NameInMap("Mandatory")
    public Boolean mandatory;

    @NameInMap("Matcher")
    public String matcher;

    @NameInMap("MatcherOptions")
    public java.util.Map<String, String> matcherOptions;

    @NameInMap("Name")
    public String name;

    @NameInMap("Parent")
    public String parent;

    @NameInMap("RbKeyDescription")
    public String rbKeyDescription;

    @NameInMap("RbKeyLabel")
    public String rbKeyLabel;

    @NameInMap("RbKeyValidationMessage")
    public String rbKeyValidationMessage;

    @NameInMap("RecursiveSupported")
    public Boolean recursiveSupported;

    @NameInMap("Type")
    public String type;

    @NameInMap("UiHint")
    public String uiHint;

    @NameInMap("ValidationMessage")
    public String validationMessage;

    @NameInMap("ValidationRegEx")
    public String validationRegEx;

    public static ResourceDef build(java.util.Map<String, ?> map) throws Exception {
        ResourceDef self = new ResourceDef();
        return TeaModel.build(map, self);
    }

    public ResourceDef setAccessTypeRestrictions(java.util.List<String> accessTypeRestrictions) {
        this.accessTypeRestrictions = accessTypeRestrictions;
        return this;
    }
    public java.util.List<String> getAccessTypeRestrictions() {
        return this.accessTypeRestrictions;
    }

    public ResourceDef setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ResourceDef setExcludesSupported(Boolean excludesSupported) {
        this.excludesSupported = excludesSupported;
        return this;
    }
    public Boolean getExcludesSupported() {
        return this.excludesSupported;
    }

    public ResourceDef setIsValidLeaf(Boolean isValidLeaf) {
        this.isValidLeaf = isValidLeaf;
        return this;
    }
    public Boolean getIsValidLeaf() {
        return this.isValidLeaf;
    }

    public ResourceDef setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public ResourceDef setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ResourceDef setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public ResourceDef setLookupSupported(Boolean lookupSupported) {
        this.lookupSupported = lookupSupported;
        return this;
    }
    public Boolean getLookupSupported() {
        return this.lookupSupported;
    }

    public ResourceDef setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
        return this;
    }
    public Boolean getMandatory() {
        return this.mandatory;
    }

    public ResourceDef setMatcher(String matcher) {
        this.matcher = matcher;
        return this;
    }
    public String getMatcher() {
        return this.matcher;
    }

    public ResourceDef setMatcherOptions(java.util.Map<String, String> matcherOptions) {
        this.matcherOptions = matcherOptions;
        return this;
    }
    public java.util.Map<String, String> getMatcherOptions() {
        return this.matcherOptions;
    }

    public ResourceDef setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResourceDef setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return this.parent;
    }

    public ResourceDef setRbKeyDescription(String rbKeyDescription) {
        this.rbKeyDescription = rbKeyDescription;
        return this;
    }
    public String getRbKeyDescription() {
        return this.rbKeyDescription;
    }

    public ResourceDef setRbKeyLabel(String rbKeyLabel) {
        this.rbKeyLabel = rbKeyLabel;
        return this;
    }
    public String getRbKeyLabel() {
        return this.rbKeyLabel;
    }

    public ResourceDef setRbKeyValidationMessage(String rbKeyValidationMessage) {
        this.rbKeyValidationMessage = rbKeyValidationMessage;
        return this;
    }
    public String getRbKeyValidationMessage() {
        return this.rbKeyValidationMessage;
    }

    public ResourceDef setRecursiveSupported(Boolean recursiveSupported) {
        this.recursiveSupported = recursiveSupported;
        return this;
    }
    public Boolean getRecursiveSupported() {
        return this.recursiveSupported;
    }

    public ResourceDef setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ResourceDef setUiHint(String uiHint) {
        this.uiHint = uiHint;
        return this;
    }
    public String getUiHint() {
        return this.uiHint;
    }

    public ResourceDef setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
        return this;
    }
    public String getValidationMessage() {
        return this.validationMessage;
    }

    public ResourceDef setValidationRegEx(String validationRegEx) {
        this.validationRegEx = validationRegEx;
        return this;
    }
    public String getValidationRegEx() {
        return this.validationRegEx;
    }

}
